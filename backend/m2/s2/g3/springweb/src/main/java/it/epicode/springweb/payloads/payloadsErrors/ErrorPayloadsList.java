package it.epicode.springweb.payloads.payloadsErrors;

import java.util.Date;
import java.util.List;

public record ErrorPayloadsList(
        String message,
        Date timestamp,
        List<String> errorsList
) {
}
