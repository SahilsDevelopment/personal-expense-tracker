package com.syndrome.personal_expense_tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syndrome.personal_expense_tracker.dto.TestMessageRequest;
import com.syndrome.personal_expense_tracker.dto.TestMessageResponse;
import com.syndrome.personal_expense_tracker.services.PersonalExpenseTrackerService;

@RestController
@RequestMapping("/tracker")
public class PersonalExpenseTrackerController {

    @Autowired
    private PersonalExpenseTrackerService personalExpenseTrackerService;

    @PostMapping("/test")
    public ResponseEntity<TestMessageResponse> testController(@RequestBody TestMessageRequest request) {
        return ResponseEntity.ok(personalExpenseTrackerService.testService(request.getMessage()));
    }
}
