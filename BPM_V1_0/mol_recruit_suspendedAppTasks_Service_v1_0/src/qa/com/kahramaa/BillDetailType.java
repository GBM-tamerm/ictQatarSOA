/**
 * BillDetailType.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.com.kahramaa;

public class BillDetailType  {
    private qa.com.kahramaa.ElectricityBillType electricityBillData;
    private qa.com.kahramaa.WaterBillType waterBillData;
    private java.lang.String tenantId;
    private java.lang.String electricityNumber;

    public BillDetailType() {
    }

    public qa.com.kahramaa.ElectricityBillType getElectricityBillData() {
        return electricityBillData;
    }

    public void setElectricityBillData(qa.com.kahramaa.ElectricityBillType electricityBillData) {
        this.electricityBillData = electricityBillData;
    }

    public qa.com.kahramaa.WaterBillType getWaterBillData() {
        return waterBillData;
    }

    public void setWaterBillData(qa.com.kahramaa.WaterBillType waterBillData) {
        this.waterBillData = waterBillData;
    }

    public java.lang.String getTenantId() {
        return tenantId;
    }

    public void setTenantId(java.lang.String tenantId) {
        this.tenantId = tenantId;
    }

    public java.lang.String getElectricityNumber() {
        return electricityNumber;
    }

    public void setElectricityNumber(java.lang.String electricityNumber) {
        this.electricityNumber = electricityNumber;
    }

}
