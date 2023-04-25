package com.leandrolcd.pruebatecnica.ui.menu

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ExpandLess
import androidx.compose.material.icons.outlined.ExpandMore
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import coil.compose.SubcomposeAsyncImage
import com.leandrolcd.pruebatecnica.ui.activate.ErrorScreen
import com.leandrolcd.pruebatecnica.ui.activate.LoadingScreen
import com.leandrolcd.pruebatecnica.ui.menu.models.Category
import com.leandrolcd.pruebatecnica.ui.menu.states.MenuUiState
import java.text.DecimalFormat

@Composable
fun MenuScreen(navHostController: NavHostController, viewModel: MenuViewModel = hiltViewModel()) {
    when (val status = viewModel.uiState.value) {
        is MenuUiState.Error -> {
            ErrorScreen(status.message)
        }
        MenuUiState.Loading -> {
            LoadingScreen()
        }
        is MenuUiState.Success -> {
            MenuContent(viewModel.menuList)
        }
    }
}

@Composable
fun MenuContent(category: List<Category>) {
    LazyColumn(
        content = {
            items(category) {
                ItemCategory(it)
            }
        },
        modifier = Modifier
            .background(Color.Transparent)
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(2.dp)
    )
}

@Composable
fun ItemCategory(category: Category) {

    val isExpanderCategory = remember {
        mutableStateOf(false)
    }
    CategoryItem(
        category,
        isExpanderCategory.value,
        onClicked = { isExpanderCategory.value = !isExpanderCategory.value })
}

@Composable
fun CategoryItem(category: Category, isExpander: Boolean, onClicked: () -> Unit) {

    Column(Modifier.fillMaxWidth()) {
        Row(
            Modifier
                .fillMaxWidth()
                .background(Color(0xFFFF375B)), verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = category.name, fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 16.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            IconButton(onClick = { onClicked() }) {
                if (isExpander) {
                    Icon(
                        imageVector = Icons.Outlined.ExpandLess,
                        contentDescription = "Expander Category",
                        tint = Color(0xFFF4F4F4)
                    )
                } else {
                    Icon(
                        imageVector = Icons.Outlined.ExpandMore,
                        contentDescription = "Expander Category",
                        tint = Color(0xFFF4F4F4)
                    )

                }
            }
        }
        if (isExpander) {
            ProductItems(category = category)
        }

    }

}

@Composable
fun ProductItems(category: Category) {
    Column(
        Modifier
            .fillMaxWidth()
            .heightIn(0.dp, max = 200.dp)
            .verticalScroll(rememberScrollState())
    ) {
        if (category.products != null) {
            for (it in category.products!!) {
                val isExpanderProduct = remember {
                    mutableStateOf(false)
                }
                Row(
                    Modifier
                        .fillMaxWidth()
                        .background(Color(0xFFF4F4F4)),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = it.name,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 16.dp)
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    IconButton(onClick = { isExpanderProduct.value = !isExpanderProduct.value }) {
                        if (isExpanderProduct.value) {
                            Icon(
                                imageVector = Icons.Outlined.ExpandLess,
                                contentDescription = "Product Category",
                                tint = Color(0xFFFF375B)
                            )
                        } else {
                            Icon(
                                imageVector = Icons.Outlined.ExpandMore,
                                contentDescription = "Product Category",
                                tint = Color(0xFFFF375B)
                            )

                        }
                    }

                }
                if (isExpanderProduct.value) {
                    Column() {
                        Row(
                            Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = it.name, fontWeight = FontWeight.Bold)
                            Spacer(modifier = Modifier.weight(1f))
                            val money =  DecimalFormat("#,###.00")
                            Text(text = "$ ${money.format(it.id.toDouble())}", fontWeight = FontWeight.Bold)

                        }
                        Row(
                            Modifier
                                .fillMaxWidth()
                                .padding(8.dp)
                        ) {
                            ProductImage(imageUrl = category.image, modifier = Modifier.size(50.dp))
                            it.shortDescription?.let { it1 ->
                                Text(
                                    text = it1,
                                    fontSize = 12.sp,
                                    color = Color(0xFFB2B2B2)
                                )
                            }
                        }
                    }

                }
            }
        }
    }

}

@Composable
fun ProductImage(imageUrl: String, modifier: Modifier) {
    SubcomposeAsyncImage(
        model = imageUrl,
        loading = {
            Box(contentAlignment = Alignment.Center) {
                CircularProgressIndicator(
                    modifier = Modifier
                        .height(45.dp)
                        .width(45.dp)
                )
            }
        },
        contentDescription = "Product image",
        modifier = modifier.fillMaxWidth()
    )
}