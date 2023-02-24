package com.haktanozgur.MyStore.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.haktanozgur.MyStore.dto.FilterDto;
import com.haktanozgur.MyStore.dto.StoreDto;
import com.haktanozgur.MyStore.entity.Store;
import com.haktanozgur.MyStore.response.ServiceResponse;

public interface StoreService {

	ServiceResponse addProduct(StoreDto store) throws JsonProcessingException;
	ServiceResponse deleteProduct(FilterDto filter);
}
