package com.opencredo.api.acceptance.test.common;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Repository {
    public String id;
    public String name;
    public String full_name;
}