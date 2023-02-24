package com.haktanozgur.MyStore.entity;

import java.awt.Color;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.haktanozgur.MyStore.enums.Brand;
import com.haktanozgur.MyStore.enums.ColorList;
import com.haktanozgur.MyStore.enums.ProductType;
import com.haktanozgur.MyStore.enums.Role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Table(name = "products")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Store {

	@Id
	@SequenceGenerator(name = "products_id_seq_gen", sequenceName = "products_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "products_id_seq_gen")
	private Integer id;
	@Column(name = "product_code")
	private String code;
	@Column(name = "product_type")
	private String type;
	@Column(name = "brand_name")
	private String brand;
	@Column(name = "product_model")
	private String model;
	@Column(name = "color_list")
	private String[] colorList;
	@Column(name = "ram_list")
	private Integer[] ramList;
	@Column(name = "inc")
	private float inc;
	@Column(name = "stock")
	private Integer stock;
	


}
