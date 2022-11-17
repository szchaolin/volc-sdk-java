package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class LogTemplate {
    @JSONField(name = TYPE)
    String type;
    @JSONField(name = FORMAT)
    String format;
}
