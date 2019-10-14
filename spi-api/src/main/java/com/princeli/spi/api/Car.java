package com.princeli.spi.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : princeli
 * @version 1.0
 * @className Car
 * @date 2019-10-14 22:07
 * @description: TODO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    private String name;

    private Wheel wheel;
}
