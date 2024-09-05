package com.dgmf.versioning.controllerversioning;

import com.dgmf.versioning.entityversioning.Name;
import com.dgmf.versioning.entityversioning.PersionV1;
import com.dgmf.versioning.entityversioning.PersionV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
    @GetMapping("/v1/person")
    public PersionV1 getFirstVersionOfPerson() {
        return new PersionV1("Bob Charlie");
    }

    @GetMapping("/v2/person")
    public PersionV2 getSecondVersionOfPerson() {
        return new PersionV2(new Name("Bob", "Charlie"));
    }
}
