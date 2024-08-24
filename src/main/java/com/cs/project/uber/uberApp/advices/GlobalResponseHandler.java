package com.cs.project.uber.uberApp.advices;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.List;

@RestControllerAdvice
public class GlobalResponseHandler implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return true;
    }

        @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        List<String> allowedRoutes = List.of("/v3/api-docs","/actuator");
        boolean isAllowed = allowedRoutes
                .stream()
                .anyMatch(route -> request.getURI().getPath().contains(route));


        if(body instanceof ApiResponse<?> || isAllowed) {
            return body;
        }

        return new ApiResponse<>(body);
    }

}

//    @Override
//    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
//                                  Class<? extends HttpMessageConverter<?>> selectedConverterType,
//                                  ServerHttpRequest request, ServerHttpResponse response) {
//
//        // Bypass wrapping for certain routes
//        List<String> allowedRoutes = List.of("/v3/api-docs", "/actuator");
//        boolean isAllowed = allowedRoutes.stream()
//                .anyMatch(route -> request.getURI().getPath().contains(route));
//
//        if (isAllowed) {
//            return body;
//        }
//
//        // Check if the response should be wrapped in ApiResponse
//        if (body instanceof ApiResponse<?>) {
//            return body;
//        }
//
//        // Handle cases where the response is binary or has specific content types
//        if (selectedContentType != null && (
//                selectedContentType.equals(MediaType.APPLICATION_OCTET_STREAM) ||
//                        selectedContentType.equals(MediaType.IMAGE_JPEG) ||
//                        selectedContentType.equals(MediaType.IMAGE_PNG) ||
//                        selectedContentType.equals(MediaType.APPLICATION_PDF))) {
//            return body;  // Do not wrap binary data in ApiResponse
//        }
//
//        return new ApiResponse<>(body);
//    }
