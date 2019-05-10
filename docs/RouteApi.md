# RouteApi

All URIs are relative to *https://jeansthesis.nl:8080/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addRouteIdentifier**](RouteApi.md#addRouteIdentifier) | **POST** /route/create | Route identifier


<a name="addRouteIdentifier"></a>
# **addRouteIdentifier**
> Route addRouteIdentifier(route)

Route identifier

Returns the given route with an added route identifier.

### Example
```java
// Import classes:
//import sdk.railways.ApiClient;
//import sdk.railways.ApiException;
//import sdk.railways.Configuration;
//import sdk.railways.auth.*;
//import sdk.railways.api.RouteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: idKey
ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
idKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//idKey.setApiKeyPrefix("Token");

RouteApi apiInstance = new RouteApi();
Route route = new Route(); // Route | The route that needs an identifier.
try {
    Route result = apiInstance.addRouteIdentifier(route);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RouteApi#addRouteIdentifier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **route** | [**Route**](Route.md)| The route that needs an identifier. |

### Return type

[**Route**](Route.md)

### Authorization

[idKey](../README.md#idKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

