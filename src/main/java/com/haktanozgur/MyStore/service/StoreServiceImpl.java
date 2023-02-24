package com.haktanozgur.MyStore.service;

import org.springframework.stereotype.Service;
import com.haktanozgur.MyStore.dto.FilterDto;
import com.haktanozgur.MyStore.dto.StoreDto;
import com.haktanozgur.MyStore.response.ServiceResponse;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StoreServiceImpl implements StoreService {
	

	@Override
	public ServiceResponse addProduct(StoreDto storeDto) {
        return null;
	}

	@Override
	public ServiceResponse deleteProduct(FilterDto filter) {
		return null;
	}

}
