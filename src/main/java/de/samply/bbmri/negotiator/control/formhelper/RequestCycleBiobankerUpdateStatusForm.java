package de.samply.bbmri.negotiator.control.formhelper;

public class RequestCycleBiobankerUpdateStatusForm {
    private Integer collectionId;
    private String nextCollectionLifecycleStatusStatus;
    private Integer numberOfSamplesAvailable;
    private String indicateAccessConditions;
    private String shippedNumber;

    public RequestCycleBiobankerUpdateStatusForm(Integer collectionId, String nextCollectionLifecycleStatusStatus, Integer numberOfSamplesAvailable, String indicateAccessConditions, String shippedNumber) {
        this.collectionId = collectionId;
        this.nextCollectionLifecycleStatusStatus = nextCollectionLifecycleStatusStatus;
        this.numberOfSamplesAvailable = numberOfSamplesAvailable;
        this.indicateAccessConditions = indicateAccessConditions;
        this.shippedNumber = shippedNumber;
    }

    public String getShippedNumber() {
        return shippedNumber;
    }

    public void setShippedNumber(String shippedNumber) {
        this.shippedNumber = shippedNumber;
    }

    public String getIndicateAccessConditions() {
        return indicateAccessConditions;
    }

    public void setIndicateAccessConditions(String indicateAccessConditions) {
        this.indicateAccessConditions = indicateAccessConditions;
    }

    public Integer getNumberOfSamplesAvailable() {
        return numberOfSamplesAvailable;
    }

    public void setNumberOfSamplesAvailable(Integer numberOfSamplesAvailable) {
        this.numberOfSamplesAvailable = numberOfSamplesAvailable;
    }

    public String getNextCollectionLifecycleStatusStatus() {
        return nextCollectionLifecycleStatusStatus;
    }

    public void setNextCollectionLifecycleStatusStatus(String nextCollectionLifecycleStatusStatus) {
        this.nextCollectionLifecycleStatusStatus = nextCollectionLifecycleStatusStatus;
    }

    public Integer getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }
}
