package com.example.common.thing;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * title: ThingService
 * description: TODO
 *
 * @author iok_own
 * date 2023/10/18 11:02
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ThingService<T> {
    public static final String TYPE_PROPERTY = "property";
    public static final String TYPE_SERVICE = "service";

    public static final String TYPE_OTA = "ota";

    private String mid;

    private String productKey;

    private String deviceName;

    private String type;

    private String identifier;

    private T params;

}
