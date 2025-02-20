package com.example.inovantsolutionstask.model

import com.google.gson.annotations.SerializedName

data class ProductResponse(
    @SerializedName("status")
    val status: Int,
    @SerializedName("message")
    val message: String,
    @SerializedName("data")
    val data: Product
)

data class Product(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("price")
    val price: String,
    @SerializedName("final_price")
    val finalPrice: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("image")
    val mainImage: String,
    @SerializedName("images")
    val images: List<String>,
    @SerializedName("configurable_option")
    val configurableOptions: List<ConfigurableOption>
)

data class ConfigurableOption(
    @SerializedName("attribute_code")
    val attributeCode: String,
    @SerializedName("attributes")
    val attributes: List<ProductAttribute>
)

data class ProductAttribute(
    @SerializedName("value")
    val value: String,
    @SerializedName("images")
    val images: List<String>
)