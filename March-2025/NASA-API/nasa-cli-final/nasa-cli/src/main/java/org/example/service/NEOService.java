package org.example.service;

import org.example.model.NeoFeedResponse;
import org.springframework.web.client.RestTemplate;

public class NEOService {

    private RestTemplate template = new RestTemplate();

    private final String API_URL="https://api.nasa.gov/neo/rest/v1/feed";

    private final String API_KEY="wycFeUOQFTv2XpL3KSmInmJkegnCkbn068JXzjjm";

    public NeoFeedResponse getNEOData(String date){
        String url = API_URL +
                "?start_date=" + date +
                "&end_date=" + date +
                "&api_key=" + API_KEY;
//        String response = template.getForObject(url, String.class).toString();
//        System.out.println(response);
        NeoFeedResponse response =
                template.getForObject(url, NeoFeedResponse.class);

        return response;

    }
}
