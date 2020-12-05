package com.grupoasesores.liverpool.service.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class LiverpoolProducts {

    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("pageType")
    @Expose
    private String pageType;
    @SerializedName("plpResults")
    @Expose
    private PlpResults plpResults;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getPageType() {
        return pageType;
    }

    public void setPageType(String pageType) {
        this.pageType = pageType;
    }

    public PlpResults getPlpResults() {
        return plpResults;
    }

    public void setPlpResults(PlpResults plpResults) {
        this.plpResults = plpResults;
    }









public class PlpResults {

    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("plpState")
    @Expose
    private PlpState plpState;
    @SerializedName("sortOptions")
    @Expose
    private List<SortOption> sortOptions = null;
    @SerializedName("refinementGroups")
    @Expose
    private List<RefinementGroup> refinementGroups = null;
    @SerializedName("records")
    @Expose
    private List<Record> records = null;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public PlpState getPlpState() {
        return plpState;
    }

    public void setPlpState(PlpState plpState) {
        this.plpState = plpState;
    }

    public List<SortOption> getSortOptions() {
        return sortOptions;
    }

    public void setSortOptions(List<SortOption> sortOptions) {
        this.sortOptions = sortOptions;
    }

    public List<RefinementGroup> getRefinementGroups() {
        return refinementGroups;
    }

    public void setRefinementGroups(List<RefinementGroup> refinementGroups) {
        this.refinementGroups = refinementGroups;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

}






public class PlpState {

    @SerializedName("categoryId")
    @Expose
    private String categoryId;
    @SerializedName("currentSortOption")
    @Expose
    private String currentSortOption;
    @SerializedName("currentFilters")
    @Expose
    private String currentFilters;
    @SerializedName("firstRecNum")
    @Expose
    private Integer firstRecNum;
    @SerializedName("lastRecNum")
    @Expose
    private Integer lastRecNum;
    @SerializedName("recsPerPage")
    @Expose
    private Integer recsPerPage;
    @SerializedName("totalNumRecs")
    @Expose
    private Integer totalNumRecs;
    @SerializedName("originalSearchTerm")
    @Expose
    private String originalSearchTerm;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCurrentSortOption() {
        return currentSortOption;
    }

    public void setCurrentSortOption(String currentSortOption) {
        this.currentSortOption = currentSortOption;
    }

    public String getCurrentFilters() {
        return currentFilters;
    }

    public void setCurrentFilters(String currentFilters) {
        this.currentFilters = currentFilters;
    }

    public Integer getFirstRecNum() {
        return firstRecNum;
    }

    public void setFirstRecNum(Integer firstRecNum) {
        this.firstRecNum = firstRecNum;
    }

    public Integer getLastRecNum() {
        return lastRecNum;
    }

    public void setLastRecNum(Integer lastRecNum) {
        this.lastRecNum = lastRecNum;
    }

    public Integer getRecsPerPage() {
        return recsPerPage;
    }

    public void setRecsPerPage(Integer recsPerPage) {
        this.recsPerPage = recsPerPage;
    }

    public Integer getTotalNumRecs() {
        return totalNumRecs;
    }

    public void setTotalNumRecs(Integer totalNumRecs) {
        this.totalNumRecs = totalNumRecs;
    }

    public String getOriginalSearchTerm() {
        return originalSearchTerm;
    }

    public void setOriginalSearchTerm(String originalSearchTerm) {
        this.originalSearchTerm = originalSearchTerm;
    }

}







public class Record {

    @SerializedName("productId")
    @Expose
    private String productId;
    @SerializedName("skuRepositoryId")
    @Expose
    private String skuRepositoryId;
    @SerializedName("productDisplayName")
    @Expose
    private String productDisplayName;
    @SerializedName("productType")
    @Expose
    private String productType;
    @SerializedName("productRatingCount")
    @Expose
    private Integer productRatingCount;
    @SerializedName("productAvgRating")
    @Expose
    private Double productAvgRating;
    @SerializedName("listPrice")
    @Expose
    private Double listPrice;
    @SerializedName("minimumListPrice")
    @Expose
    private Double minimumListPrice;
    @SerializedName("maximumListPrice")
    @Expose
    private Double maximumListPrice;
    @SerializedName("promoPrice")
    @Expose
    private Double promoPrice;
    @SerializedName("minimumPromoPrice")
    @Expose
    private Double minimumPromoPrice;
    @SerializedName("maximumPromoPrice")
    @Expose
    private Double maximumPromoPrice;
    @SerializedName("isHybrid")
    @Expose
    private Boolean isHybrid;
    @SerializedName("isMarketPlace")
    @Expose
    private Boolean isMarketPlace;
    @SerializedName("smImage")
    @Expose
    private String smImage;
    @SerializedName("lgImage")
    @Expose
    private String lgImage;
    @SerializedName("xlImage")
    @Expose
    private String xlImage;
    @SerializedName("groupType")
    @Expose
    private String groupType;
    @SerializedName("plpFlags")
    @Expose
    private List<Object> plpFlags = null;
    @SerializedName("variantsColor")
    @Expose
    private List<VariantsColor> variantsColor = null;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSkuRepositoryId() {
        return skuRepositoryId;
    }

    public void setSkuRepositoryId(String skuRepositoryId) {
        this.skuRepositoryId = skuRepositoryId;
    }

    public String getProductDisplayName() {
        return productDisplayName;
    }

    public void setProductDisplayName(String productDisplayName) {
        this.productDisplayName = productDisplayName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Integer getProductRatingCount() {
        return productRatingCount;
    }

    public void setProductRatingCount(Integer productRatingCount) {
        this.productRatingCount = productRatingCount;
    }

    public Double getProductAvgRating() {
        return productAvgRating;
    }

    public void setProductAvgRating(Double productAvgRating) {
        this.productAvgRating = productAvgRating;
    }

    public Double getListPrice() {
        return listPrice;
    }

    public void setListPrice(Double listPrice) {
        this.listPrice = listPrice;
    }

    public Double getMinimumListPrice() {
        return minimumListPrice;
    }

    public void setMinimumListPrice(Double minimumListPrice) {
        this.minimumListPrice = minimumListPrice;
    }

    public Double getMaximumListPrice() {
        return maximumListPrice;
    }

    public void setMaximumListPrice(Double maximumListPrice) {
        this.maximumListPrice = maximumListPrice;
    }

    public Double getPromoPrice() {
        return promoPrice;
    }

    public void setPromoPrice(Double promoPrice) {
        this.promoPrice = promoPrice;
    }

    public Double getMinimumPromoPrice() {
        return minimumPromoPrice;
    }

    public void setMinimumPromoPrice(Double minimumPromoPrice) {
        this.minimumPromoPrice = minimumPromoPrice;
    }

    public Double getMaximumPromoPrice() {
        return maximumPromoPrice;
    }

    public void setMaximumPromoPrice(Double maximumPromoPrice) {
        this.maximumPromoPrice = maximumPromoPrice;
    }

    public Boolean getIsHybrid() {
        return isHybrid;
    }

    public void setIsHybrid(Boolean isHybrid) {
        this.isHybrid = isHybrid;
    }

    public Boolean getIsMarketPlace() {
        return isMarketPlace;
    }

    public void setIsMarketPlace(Boolean isMarketPlace) {
        this.isMarketPlace = isMarketPlace;
    }

    public String getSmImage() {
        return smImage;
    }

    public void setSmImage(String smImage) {
        this.smImage = smImage;
    }

    public String getLgImage() {
        return lgImage;
    }

    public void setLgImage(String lgImage) {
        this.lgImage = lgImage;
    }

    public String getXlImage() {
        return xlImage;
    }

    public void setXlImage(String xlImage) {
        this.xlImage = xlImage;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public List<Object> getPlpFlags() {
        return plpFlags;
    }

    public void setPlpFlags(List<Object> plpFlags) {
        this.plpFlags = plpFlags;
    }

    public List<VariantsColor> getVariantsColor() {
        return variantsColor;
    }

    public void setVariantsColor(List<VariantsColor> variantsColor) {
        this.variantsColor = variantsColor;
    }

}






 class Refinement {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("refinementId")
    @Expose
    private String refinementId;
    @SerializedName("selected")
    @Expose
    private Boolean selected;
    @SerializedName("colorHex")
    @Expose
    private String colorHex;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getRefinementId() {
        return refinementId;
    }

    public void setRefinementId(String refinementId) {
        this.refinementId = refinementId;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public String getColorHex() {
        return colorHex;
    }

    public void setColorHex(String colorHex) {
        this.colorHex = colorHex;
    }

}







public class RefinementGroup {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("refinement")
    @Expose
    private List<Refinement> refinement = null;
    @SerializedName("multiSelect")
    @Expose
    private Boolean multiSelect;
    @SerializedName("dimensionName")
    @Expose
    private String dimensionName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Refinement> getRefinement() {
        return refinement;
    }

    public void setRefinement(List<Refinement> refinement) {
        this.refinement = refinement;
    }

    public Boolean getMultiSelect() {
        return multiSelect;
    }

    public void setMultiSelect(Boolean multiSelect) {
        this.multiSelect = multiSelect;
    }

    public String getDimensionName() {
        return dimensionName;
    }

    public void setDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
    }

}

public class SortOption {

    @SerializedName("sortBy")
    @Expose
    private String sortBy;
    @SerializedName("label")
    @Expose
    private String label;

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}






public class Status {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("statusCode")
    @Expose
    private Integer statusCode;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

}






 class VariantsColor {

    @SerializedName("colorName")
    @Expose
    private String colorName;
    @SerializedName("colorHex")
    @Expose
    private String colorHex;
    @SerializedName("colorImageURL")
    @Expose
    private String colorImageURL;

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getColorHex() {
        return colorHex;
    }

    public void setColorHex(String colorHex) {
        this.colorHex = colorHex;
    }

    public String getColorImageURL() {
        return colorImageURL;
    }

    public void setColorImageURL(String colorImageURL) {
        this.colorImageURL = colorImageURL;
    }

}
}