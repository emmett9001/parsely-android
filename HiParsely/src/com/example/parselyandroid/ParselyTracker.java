//
// ParselyTracker.java
// ParselyAndroid
//
// Copyright 2013 Parse.ly
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.example.parselyandroid;

public class ParselyTracker {
	private static ParselyTracker instance = null;
	
	private String apikey, rootUrl;
	private int flushInterval, queueSizeLimit, storageLimit;
	private Boolean shouldBatchRequests;
	
	protected ParselyTracker(String apikey, int flushInterval){
		super();
		this.apikey = apikey;
		this.flushInterval = flushInterval;
		this.shouldBatchRequests = true;
		this.rootUrl = "http://localhost:5001/mobileproxy";
		this.queueSizeLimit = 5;
		this.storageLimit = 20;
	}
	
	public static ParselyTracker sharedInstance(){
		if(instance == null){
			return null;
		}
		return instance;
	}
	
	public static ParselyTracker sharedInstance(String apikey, int flushInterval){
		if(instance == null){
			instance = new ParselyTracker(apikey, flushInterval);
		}
		return instance;
	}
}