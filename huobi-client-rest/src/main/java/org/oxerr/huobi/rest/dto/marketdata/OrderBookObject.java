package org.oxerr.huobi.rest.dto.marketdata;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderBookObject {

	private final BigDecimal price;
	private final BigDecimal level;
	private final BigDecimal amount;

	public OrderBookObject(
			@JsonProperty("price") final BigDecimal price,
			@JsonProperty("level") final BigDecimal level,
			@JsonProperty("amount") final BigDecimal amount) {
		this.price = price;
		this.level = level;
		this.amount = amount;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public BigDecimal getLevel() {
		return level;
	}

	public BigDecimal getAmount() {
		return amount;
	}

}
