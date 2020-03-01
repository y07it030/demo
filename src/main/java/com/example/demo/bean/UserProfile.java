package com.example.demo.bean;

import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class UserProfile {

	public String UserProfileSuggestion(String firstName, String secondName) {

		return (firstName.substring(0, 4).concat(secondName.substring(0, 4)));

	}

	public String CreateUserProfile(List<String> userIds, String suggesstion) {

		if (userIds.contains(suggesstion)) {
			for (int i = 1; i <= 100; i++) {
				String newSuggesstion = suggesstion.concat(String.valueOf(i));
				if (userIds.contains(newSuggesstion))
					continue;
				else {
					suggesstion = newSuggesstion;
				break;
				}
			}
		} else {
			suggesstion = suggesstion;
		}

		return suggesstion;

	}

}
