package com.syndrome.personal_expense_tracker.services.implementation;

import org.springframework.stereotype.Service;

import com.syndrome.personal_expense_tracker.dto.TestMessageResponse;
import com.syndrome.personal_expense_tracker.services.PersonalExpenseTrackerService;

@Service
public class PersonalExpenseTrackerServiceImpl implements PersonalExpenseTrackerService {

    @Override
    public TestMessageResponse testService(String message) {
        return TestMessageResponse.builder()
                .message("Service received: " + message)
                .build();
    }
}
