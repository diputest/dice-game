package com.game.dice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Dipu on 11/24/22.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response <T>{

    private T data;
}
