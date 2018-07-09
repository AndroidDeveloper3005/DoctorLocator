package com.doctor_locator.himel.doctor_locator.listener;

import com.doctor_locator.himel.doctor_locator.model.Store;
import java.util.ArrayList;

public interface RetrofitDataLoadListener {
    void finishLoadData(ArrayList<Store> dataList, boolean isSuccessful);

}
