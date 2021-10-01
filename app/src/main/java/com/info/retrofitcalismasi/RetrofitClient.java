package com.info.retrofitcalismasi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit = null ; // retrofit nesnesi oluşturdu.
    public static Retrofit getClient(String baseUrl) { // retrofit nesnesi döndüren bir metod oluşturduk. baseUrlden kasıt interfacede web servisinin son uzantısı yazıldı.
                                                             //geri kalan kısım ise baseUrl olucak. yani www.asdasd.com/ kısmı
        if(retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create()) // gson olarak dönüştürücez.
                    .build();
        }

        return retrofit;
    }
}
