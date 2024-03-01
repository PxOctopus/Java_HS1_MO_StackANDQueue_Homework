package com.cagri.Q2;

import java.util.Random;

public class Customer {
    private String id;

    public Customer(String id) {
      this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Customer{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
