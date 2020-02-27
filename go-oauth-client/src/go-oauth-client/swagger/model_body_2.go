/*
 * BaaS API Gateway
 *
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * API version: 1.0.0
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

type Body2 struct {

	GrantType string `json:"grant_type,omitempty"`
	// Default scope is \"\" means all scope. profile: can browse swagger api page and get user info query: can query data from blockchain invoke: can invoke contract and change data in blockchain event: can receive event from subscribe api content_check: can enable content check, to call alibaba Content Moderation oss: can enable query/invoke with file, use oss to store big file 
	Scope string `json:"scope,omitempty"`
	// Refresh token to refresh access token
	RefreshToken string `json:"refresh_token,omitempty"`
	// Access token alive time in seconds, default is 12 hours, maximu is 24 hours.
	AccessTokenLifetime int32 `json:"access_token_lifetime,omitempty"`
	// Refresh token alive time in seconds, default is 24 hours, -1 means always valid.
	RefreshTokenLifetime int32 `json:"refresh_token_lifetime,omitempty"`
}
