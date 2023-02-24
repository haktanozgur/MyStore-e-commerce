package com.haktanozgur.MyStore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.haktanozgur.MyStore.service.StoreServiceImpl;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("store")
@RequiredArgsConstructor
public class StoreController {

	@Autowired
	StoreServiceImpl storeService;
	
}
