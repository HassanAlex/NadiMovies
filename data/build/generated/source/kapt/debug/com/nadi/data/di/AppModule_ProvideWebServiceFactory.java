// Generated by Dagger (https://dagger.dev).
package com.nadi.data.di;

import com.nadi.data.network.MovieAPIs;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideWebServiceFactory implements Factory<MovieAPIs> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideWebServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public MovieAPIs get() {
    return provideWebService(retrofitProvider.get());
  }

  public static AppModule_ProvideWebServiceFactory create(Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideWebServiceFactory(retrofitProvider);
  }

  public static MovieAPIs provideWebService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideWebService(retrofit));
  }
}
