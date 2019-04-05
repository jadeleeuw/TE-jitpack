# railways

Railways API Game!
- API version: 1.0
  - Build date: 2019-04-05T17:38:51.364752+02:00[Europe/Amsterdam]

Find your way in the Tokyo railway system!


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>TE.sdk</groupId>
  <artifactId>railways</artifactId>
  <version>v2.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "TE.sdk:railways:v2.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/railways-v2.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import sdk.railways.*;
import sdk.railways.auth.*;
import sdk.railways.model.*;
import sdk.railways.api.DistanceApi;

import java.io.File;
import java.util.*;

public class DistanceApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: idKey
        ApiKeyAuth idKey = (ApiKeyAuth) defaultClient.getAuthentication("idKey");
        idKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idKey.setApiKeyPrefix("Token");

        DistanceApi apiInstance = new DistanceApi();
        Integer from = 2600319; // Integer | The id of the first station
        Integer to = 2600307; // Integer | The id of the other station
        try {
            DistanceResponse result = apiInstance.getDistanceBetweenStations(from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DistanceApi#getDistanceBetweenStations");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080/api/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DistanceApi* | [**getDistanceBetweenStations**](docs/DistanceApi.md#getDistanceBetweenStations) | **GET** /distance/stations | Distance between stations
*DistanceApi* | [**getDistanceOfRoute**](docs/DistanceApi.md#getDistanceOfRoute) | **POST** /distance/route | Distance of route
*RailwayApi* | [**getRailway**](docs/RailwayApi.md#getRailway) | **GET** /railways/{railwayId} | Railway by id
*RailwayApi* | [**getRailways**](docs/RailwayApi.md#getRailways) | **GET** /railways | All railways
*RailwayApi* | [**getStationsOnRailway**](docs/RailwayApi.md#getStationsOnRailway) | **GET** /railways/{railwayId}/stations | All station on railway
*RouteApi* | [**addRouteIdentifier**](docs/RouteApi.md#addRouteIdentifier) | **POST** /route/create | Route identifier
*StationApi* | [**getRailwaysConnectedToStation**](docs/StationApi.md#getRailwaysConnectedToStation) | **GET** /stations/{stationId}/railways | All railways on station
*StationApi* | [**getStation**](docs/StationApi.md#getStation) | **GET** /stations | Station by id
*StationApi* | [**getStationByName**](docs/StationApi.md#getStationByName) | **GET** /stations/findbyname | Station by name
*StationApi* | [**getStationName**](docs/StationApi.md#getStationName) | **GET** /stations/{stationId}/name | Name of station
*StationApi* | [**getStations**](docs/StationApi.md#getStations) | **GET** /stations/all | All stations
*TaskApi* | [**getTask**](docs/TaskApi.md#getTask) | **GET** /task | Origin and destination station
*TaskApi* | [**submit**](docs/TaskApi.md#submit) | **PUT** /task/submit | Submit


## Documentation for Models

 - [DistanceResponse](docs/DistanceResponse.md)
 - [NameResponse](docs/NameResponse.md)
 - [Railway](docs/Railway.md)
 - [Route](docs/Route.md)
 - [Station](docs/Station.md)
 - [SubmissionResult](docs/SubmissionResult.md)
 - [Task](docs/Task.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### idKey

- **Type**: API key
- **API key parameter name**: x-idkey
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



