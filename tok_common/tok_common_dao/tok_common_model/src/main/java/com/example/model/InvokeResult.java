package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * title: InvokeResult
 * description:
 *
 * @author iok_own
 * date 2023/10/19 10:02
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvokeResult {
    private String requestId;
    private long time;

    public InvokeResult(String requestId) {
        this.requestId = requestId;
        this.time=System.nanoTime();
    }
}
