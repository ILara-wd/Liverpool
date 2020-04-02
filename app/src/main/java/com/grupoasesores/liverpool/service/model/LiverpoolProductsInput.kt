package com.grupoasesores.liverpool.service.model

class LiverpoolProductsInput {
    var status: Status? = null
    var pageType: String? = null
    var plpResults: PlpResults? = null
}

class PlpResults {
    var label: String? = null
    var plpState: PlpState? = null
    var sortOptions: List<SortOption>? = null
    var refinementGroups: List<RefinementGroup>? = null
    var records: List<Record>? = null
}

class PlpState {
    var categoryId: String? = null
    var currentSortOption: String? = null
    var currentFilters: String? = null
    var firstRecNum: Int? = null
    var lastRecNum: Int? = null
    var recsPerPage: Int? = null
    var totalNumRecs: Int? = null
    var originalSearchTerm: String? = null
}

class Record {
    var productId: String? = null
    var skuRepositoryId: String? = null
    var productDisplayName: String? = null
    var productType: String? = null
    var productRatingCount: Int? = null
    var productAvgRating: Double? = null
    var listPrice: Double? = null
    var minimumListPrice: Double? = null
    var maximumListPrice: Double? = null
    var promoPrice: Double? = null
    var minimumPromoPrice: Double? = null
    var maximumPromoPrice: Double? = null
    var isHybrid: Boolean? = null
    var isMarketPlace: Boolean? = null
    var smImage: String? = null
    var lgImage: String? = null
    var xlImage: String? = null
    var groupType: String? = null
    var plpFlags: List<Any>? = null
    var variantsColor: List<VariantsColor>? = null
}

class Refinement {
    var count: Int? = null
    var label: String? = null
    var refinementId: String? = null
    var selected: Boolean? = null
    var colorHex: String? = null
}

class RefinementGroup {
    var name: String? = null
    var refinement: List<Refinement>? = null
    var multiSelect: Boolean? = null
    var dimensionName: String? = null
}

class SortOption {
    var sortBy: String? = null
    var label: String? = null
}

class Status {
    var status: String? = null
    var statusCode: Int? = null
    var errorDescription: String? = null
}

class VariantsColor {
    var colorName: String? = null
    var colorHex: String? = null
    var colorImageURL: String? = null
}