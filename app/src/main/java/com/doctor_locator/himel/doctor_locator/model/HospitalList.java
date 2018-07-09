
package com.doctor_locator.himel.doctor_locator.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HospitalList {

    @SerializedName("hospital")
    @Expose
    private List<Hospital> hospital = null;

    public List<Hospital> getHospital() {
        return hospital;
    }

    public void setHospital(List<Hospital> hospital) {
        this.hospital = hospital;
    }

}
