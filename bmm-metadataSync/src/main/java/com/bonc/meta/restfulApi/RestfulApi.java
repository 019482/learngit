package com.bonc.meta.restfulApi;

import org.apache.http.client.methods.HttpPost;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by malz on 2019/6/6.
 */
public class RestfulApi {
	private static final Logger logger = LoggerFactory.getLogger(RestfulApi.class);

	@Value("${config.metaDirServiceLoad}")
	String dirLoadInfo;

	@RequestMapping(value = "/getDirInfo")
	public Map<String, String> getDirInfo(String uuid, String oid) throws Exception {

		return null;
	}


}
