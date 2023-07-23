<img align="left" src="https://i.imgur.com/QoJjbkn.png" alt="drawing" width="150" style="margin-right: 20px;"/>

# Metron Comics Client
This is a straightforward client written in Kotlin, designed to navigate and query the https://metron.cloud/ API. The API allows users to search for information about comics from the metron database.

---

## Getting Started

To begin, import the library using jitpack.io.

You can include jitpack in your pom.xml by using the following code:
```xml
<repository>
    <id>jitpack.io</id>
    <url>https://www.jitpack.io</url>
</repository>
```

Then add this Metron Comics Client Library to your project!

```xml
<dependency>
    <groupId>com.github.official-wizard</groupId>
    <artifactId>metron-comics</artifactId>
    <version>1.0.0</version>
</dependency>
```
---

## Credentials
To gain your credentials to access the API you must create an account on https://metron.cloud, the username and password you use is what will be used to access the API!

# Usage
To begin, create an instance of the Client/API to access metron!

## Create instance
```kotlin
// your Metron credentials
val credentials: Credentials = Credentials("<username>", "<password>")

// client instance 
val client: MetronClient = MetronClient(credentials, Client.Version.V1)

// api access
val api = client.api
```

---

## Search Issue Example
Search for a list of available issues by the provided query parameters!
### Available Parameters (Optional)
These parameters are available to filter for comics available based on the provided information!

Filter  | Description
-------- | -------------
series_name | filter by series name
cover_month  | filter by cover month
cover_year  | filter by cover year
cv_id  | filter [Comic Vine ID](https://www.wikidata.org/wiki/Property:P5905)
modified_gt | filter by last modified greather than date (e.g Sat,22 Jul 2023 04:20:52 GMT)
number | filter by issue number
page | select a query page to traverse
publisher_id | filter by publisher id
publisher_name | filter by publisher name
series_id | filter by series id
series_year_began | filter by year series began
sku | filter by barcode (sku)
store_date | filter by store date
store_date_range_after | filter by store date after
store_date_range_before | filter by store date before
upc | filter by UPC id


### Example
```kotlin
// your Metron credentials
val credentials: Credentials = Credentials("<username>", "<password>")

// client instance 
val client: MetronClient = MetronClient(credentials)

// api access
val api = client.api

// search for issues by series name
val issuesRequest = api.getIssues(series_name = "Howard the Duck").execute()
if (!issuesResponse.isSuccessful) {
    // handle error, e.g. issuesResponse.errorBody() 
    return
}

// obtain the request body
val issues = issuesResponse.body()
if (issues == null) {
    // unexpected null body this usually happens if there's an error, 
    // as above
    return
}

// no results were returned
if (issues.results.isEmpty()) {
    // handle no issues being available by the query parameters
    return
}

val firstIssue = issues.results.first()
val firstIssueId = firstIssue.id

// search for the details for the issue's ID obtained
val issueDetailsRequest = api.getIssue(firstIssueId).execute()
if (!issueDetailsRequest.isSuccessful) {
    // handle error, e.g. issueResponse.errorBody() 
    return
}

// obtain details
val issueDetails = issueDetailsRequest.body()
if (issueDetails == null) {
    // null check and handle unexpected null body
    // this usually happens if there's an error, as above
    return
}

// do as you wish with the issueDetails available!
println(issueDetails.desc)
```