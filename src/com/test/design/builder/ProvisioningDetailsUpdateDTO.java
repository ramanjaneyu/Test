package com.test.design.builder;

import lombok.ToString;
/* This is the builder class used in Honeywell UDP project. */
@ToString
public class ProvisioningDetailsUpdateDTO {
    private final String commType;
    private final String deviceType;
    private final String assetName;
    private final String serialNumber;
    private final String firmwareVersion;
    private final String uploadedBy;

    //private constructor to enforce object creation through builder
    private ProvisioningDetailsUpdateDTO(Builder builder){
        this.commType = builder.commType;
        this.deviceType = builder.deviceType;
        this.assetName = builder.assetName;
        this.serialNumber = builder.serialNumber;
        this.firmwareVersion = builder.firmwareVersion;
        this.uploadedBy = builder.uploadedBy;
    }
    public static class Builder {
        private String commType;
        private String deviceType;
        private String assetName;
        private String serialNumber;
        private String firmwareVersion;
        private String uploadedBy;

        //builder methods for setting properties
        public Builder commType(String commType){
            this.commType = commType;
            return this;
        }
        public Builder deviceType(String deviceType){
            this.deviceType = deviceType;
            return this;
        }
        public Builder assetName(String assetName){
            this.assetName = assetName;
            return this;
        }
        public Builder serialNumber(String serialNumber){
            this.serialNumber = serialNumber;
            return this;
        }
        public Builder firmwareVersion(String firmwareVersion){
            this.firmwareVersion = firmwareVersion;
            return this;
        }
        public Builder uploadedBy(String uploadedBy){
            this.uploadedBy = uploadedBy;
            return this;
        }
        public ProvisioningDetailsUpdateDTO build(){
            return new ProvisioningDetailsUpdateDTO(this);
        }
    }
    public static void main(String[] args) {
        ProvisioningDetailsUpdateDTO detailsUpdateDTO = new Builder()
                .commType("TestCommType1")
                .deviceType("TestDeviceType1")
                .assetName("TestAssetName")
                .build();
        System.out.println("Print Builder class : " + detailsUpdateDTO);
    }
}
