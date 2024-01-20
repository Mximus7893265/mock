package ru.perflab.ipr.mock.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.perflab.ipr.mock.model.AccountRequest;
import ru.perflab.ipr.mock.model.AccountResponse;

import java.math.BigDecimal;
import java.util.Random;


@RestController
public class AccountController {

    private static final Logger log = LoggerFactory.getLogger(AccountController.class);
    @PostMapping("/account")
    public ResponseEntity<AccountResponse> getAccountPost(@RequestBody AccountRequest accountRequest) {
        log.info(accountRequest.toString());
        ResponseEntity<AccountResponse> response = response(accountRequest);
        log.info(response.getBody().toString());
        return response;
    }

    private ResponseEntity<AccountResponse> response(AccountRequest request) {
        switch (request.getClientId().charAt(0)) {
            case '8':
                return ResponseEntity.status(HttpStatus.ACCEPTED).body(new AccountResponse(request.getRqUID(), request.getClientId(), request.getAccount(),
                        "US", BigDecimal.valueOf(new Random().nextDouble(2000.0)), BigDecimal.valueOf(2000.00)));
            case '9':
                return ResponseEntity.status(HttpStatus.ACCEPTED).body(new AccountResponse(request.getRqUID(), request.getClientId(), request.getAccount(),
                        "EU", BigDecimal.valueOf(new Random().nextDouble(1000.0)), BigDecimal.valueOf(1000.00)));
            default:
                return ResponseEntity.status(HttpStatus.ACCEPTED).body(new AccountResponse(request.getRqUID(), request.getClientId(), request.getAccount(),
                        "RU", BigDecimal.valueOf(new Random().nextDouble(50000.0)), BigDecimal.valueOf(50000.00)));
        }
    }
}
