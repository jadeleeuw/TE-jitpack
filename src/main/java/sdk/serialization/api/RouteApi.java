package sdk.serialization.api;

import sdk.serialization.ApiClient;

import sdk.serialization.model.Route;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-10T16:08:05.987300+02:00[Europe/Amsterdam]")
public class RouteApi {
    private ApiClient apiClient;

    public RouteApi() {
        this(new ApiClient());
    }

    @Autowired
    public RouteApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Route identifier
     * Returns the given route with an added route identifier.
     * <p><b>200</b> - The route with an added identifier.
     * <p><b>400</b> - The given route already has an identifier.
     * @param route The route that needs an identifier.
     * @return Route
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Route> addRouteIdentifier(Route route) throws HttpClientErrorException {
        Object postBody = route;
        
        // verify the required parameter 'route' is set
        if (route == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'route' when calling addRouteIdentifier");
        }
        
        String path = UriComponentsBuilder.fromPath("/route/create").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "idKey" };

        ParameterizedTypeReference<Route> returnType = new ParameterizedTypeReference<Route>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
