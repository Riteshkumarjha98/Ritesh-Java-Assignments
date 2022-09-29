
package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
        private Integer id;
		private String name;
		private Integer price;
		private String brand;
		private String category;
		private Integer registration_number;
		private Integer manufacturer_id;
		
		public Product() {
			
		}
		
		public Product(Integer id, String name, Integer price, String brand, String category,
				Integer registration_number, Integer manufacturer_id) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
			this.brand = brand;
			this.category = category;
			this.registration_number = registration_number;
			this.manufacturer_id = manufacturer_id;
		}
		

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getPrice() {
			return price;
		}

		public void setPrice(Integer price) {
			this.price = price;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public Integer getRegistration_number() {
			return registration_number;
		}

		public void setRegistration_number(Integer registration_number) {
			this.registration_number = registration_number;
		}

		public Integer getManufacturer_id() {
			return manufacturer_id;
		}

		public void setManufacturer_id(Integer manufacturer_id) {
			this.manufacturer_id = manufacturer_id;
		}

		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand + ", category="
					+ category + ", registration_number=" + registration_number + ", manufacturer_id=" + manufacturer_id
					+ "]";
		}
		
		
		
		
		

}
