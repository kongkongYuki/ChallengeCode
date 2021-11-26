package com.example.zendeskticketviewer.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ticket implements Serializable {
    @JsonProperty("id")
    private String id;

    @JsonProperty("external_id")
    private String external_id;


    @JsonProperty("created_at")
    private String created_at;

    @JsonProperty("updated_at")
    private String updated_at;

    @JsonProperty("type")
    private String type;

    @JsonProperty("subject")
    private String subject;

    @JsonProperty("raw_subject")
    private String raw_subject;

    @JsonProperty("description")
    private String description;

    @JsonProperty("priority")
    private String priority;

    @JsonProperty("status")
    private String status;

    @JsonProperty("recipient")
    private String recipient;

    @JsonProperty("request_id")
    private String request_id;

    @JsonProperty("submitter_id")
    private String submitter_id;

    @JsonProperty("assignee_id")
    private String assignee_id;

    @JsonProperty("organization_id")
    private String organization_id;

    @JsonProperty("group_id")
    private String group_id;

    @JsonProperty("collaborator_ids")
    private String[] collaborator_ids;

    @JsonProperty("follower_ids")
    private String[] follower_ids;

    @JsonProperty("email_cc_ids")
    private String[] email_cc_ids;

    @JsonProperty("forum_topic_id")
    private String forum_topic_id;

    @JsonProperty("problem_id")
    private String problem_id;

    @JsonProperty("has_incidents")
    private Boolean has_incidents;

    @JsonProperty("is_public")
    private Boolean is_public;

    @JsonProperty("due_at")
    private String due_at;

    @JsonProperty("tags")
    private String[] tags;

    @JsonProperty("custom_fields")
    private String[] custom_fields;

    @JsonProperty("satisfaction_rating")
    private String satisfaction_rating;

    @JsonProperty("sharing_agreement_ids")
    private String[] sharing_agreement_ids;

    @JsonProperty("fields")
    private String[] fields;

    @JsonProperty("followup_ids")
    private String[] followup_ids;

    @JsonProperty("brand_idg")
    private String brand_id;

    @JsonProperty("allow_channelback")
    private Boolean allow_channelback;

    @JsonProperty("allow_attachments")
    private Boolean allow_attachments;

    public String getId() {
        return id;
    }

    public String getExternal_id() {
        return external_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getAssignee_id() {
        return assignee_id;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public String getType() {
        return type;
    }

    public String getSubject() {
        return subject;
    }

    public String getRaw_subject() {
        return raw_subject;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getRequest_id() {
        return request_id;
    }

    public String getSubmitter_id() {
        return submitter_id;
    }

    public String getOrganization_id() {
        return organization_id;
    }

    public String getGroup_id() {
        return group_id;
    }

    public String[] getCollaborator_ids() {
        return collaborator_ids;
    }

    public String[] getFollower_ids() {
        return follower_ids;
    }

    public String[] getEmail_cc_ids() {
        return email_cc_ids;
    }

    public String getForum_topic_id() {
        return forum_topic_id;
    }

    public String getProblem_id() {
        return problem_id;
    }

    public Boolean getHas_incidents() {
        return has_incidents;
    }

    public Boolean getIs_public() {
        return is_public;
    }

    public String getDue_at() {
        return due_at;
    }

    public String[] getTags() {
        return tags;
    }

    public String[] getCustom_fields() {
        return custom_fields;
    }

    public String getSatisfaction_rating() {
        return satisfaction_rating;
    }

    public String[] getSharing_agreement_ids() {
        return sharing_agreement_ids;
    }

    public String[] getFields() {
        return fields;
    }

    public String[] getFollowup_ids() {
        return followup_ids;
    }

    public String getBrand_id() {
        return brand_id;
    }

    public Boolean getAllow_channelback() {
        return allow_channelback;
    }

    public Boolean getAllow_attachments() {
        return allow_attachments;
    }
}
