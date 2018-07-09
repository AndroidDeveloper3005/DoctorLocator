package com.doctor_locator.himel.doctor_locator.api;



import com.doctor_locator.himel.doctor_locator.model.NewsList;
import com.doctor_locator.himel.doctor_locator.model.StoreList;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET(HttpParams.SHEET_API_END_POINT)
    Call<StoreList> getStoreList(@Query("id") String sheetId, @Query("sheet") String sheetName);

    @GET(HttpParams.SHEET_API_END_POINT)
    Call<NewsList> getNewsList(@Query("id") String sheetId, @Query("sheet") String sheetName);
}
