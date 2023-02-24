package com.haktanozgur.MyStore.dto;

import com.haktanozgur.MyStore.entity.Store;
import com.haktanozgur.MyStore.enums.Brand;
import com.haktanozgur.MyStore.enums.ColorList;
import com.haktanozgur.MyStore.enums.ProductType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StoreDto {
	
	private String type;
	private String brand;
	private String model;
	private String[] colorList;
	private Integer[] ramList;
	private float inc;
	private Integer stock;

}
