package com.info.retrofitcalismasi;

import retrofit2.Call;
import retrofit2.http.GET;

public interface KisilerDaoInterface {

    @GET("kisiler/tum_kisiler.php")
    Call<KisilerCevap> tumKisiler();  // bu metod sayesinde tüm kisileri rahatlıkla alabiliriz.
}
