package com.silanis.esl.api.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.silanis.esl.api.util.date.DateSerializationUtil;
import java.io.IOException;
import java.util.Date;

public class JsonDateSerializer extends JsonSerializer<Date> {

    public void serialize(Date value, JsonGenerator gen,SerializerProvider provider) throws IOException, JsonProcessingException {
        gen.writeString(DateSerializationUtil.formatFrom(value));
    }

}
