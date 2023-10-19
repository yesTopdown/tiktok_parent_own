package com.example.common.function;

/**
 * title: IfHandler
 * description: TODO
 *
 * @author iok_own
 * date 2023/10/18 11:00
 */
@FunctionalInterface
public interface IfHandler {

    void handler(Runnable tHandler, Runnable fHandler);
}
