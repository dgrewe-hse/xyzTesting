# Review template (inspection / technical review)

**Project / product:** <!-- e.g. Application -->  
**Review object(s):** <!-- e.g. requirements spec, module X, pull request Y -->  
**Review type:** <!-- e.g. walkthrough, technical review, inspection -->  
**Date (planned / actual):** <!-- ISO date -->  
**Moderator:** <!-- name -->  
**Author(s):** <!-- name(s) -->  
**Reviewers:** <!-- names -->

---

## 1. General instructions

Use this template together with the review process you selected from the presented ones in the course. The phases below describe a typical inspection-style workflow (adapt terminology to your chosen review type if needed).

**Terminology**

| Acronym | Meaning |
|--------|---------|
| **MP** | Master Plan |
| **DS** | Data Summary |
| **LoF** | Level of Findings |
| **RR** | Review Report |

### Phases of a review / inspection

| Phase | Description |
|-------|-------------|
| **Planning** | The moderator checks whether the **entry criteria** are met (e.g. the review object is in a reviewable state). The review is planned: reviewers and dates are fixed, invitations are sent, etc. The moderator completes the **Master Plan (MP)** and identifies suitable inspection tasks. |
| **Kick-off (optional)** | In the optional kick-off meeting, the author gives reviewers background on the review object and the project context so reviewers can target defects efficiently. The moderator presents and updates the **Master Plan (MP)**. |
| **Individual preparation** | Each reviewer examines the review object for defects and other issues. Findings and their quality are reported to the moderator. The moderator consolidates findings into one document, prepares the review meeting, and derives key figures for the **Data Summary (DS)**. |
| **Review meeting** | Reviewers decide the status of each finding. Additional findings may be collected during the meeting. The group may decide whether a **re-inspection** is necessary. If useful, an optional follow-up session (“third hour”) discusses remaining issues and lessons learned. The **Level of Findings (LoF)** is updated; comments are added; status and responsibility are assigned. |
| **Reworking** | The author updates the review object according to findings and comments and refreshes reference documentation as needed. The author updates **LoF** status and records rework effort in the **Data Summary (DS)**. |
| **Follow-up** | The moderator checks that all findings are handled. If no new major issues remain, the group decides whether **re-inspection** is required. Remaining key data and metrics are included in the quality documentation. The **Review Report (RR)** is finalized and handed over (e.g. to the course team / product owner). |

---

## 2. Master Plan (MP)

### 2.1 Masterplan — header

<!-- Fill the table below during planning. Redundant with the document header above is OK if you copy values here for a self-contained MP export. -->

| Field | Value |
|-------|-------|
| Review No. | <!-- Enter the unique identification number for this review (e.g. REV-2026-001). --> |
| Project | <!-- Project or product name (e.g. ESBot). --> |
| Project manager | <!-- Name of project / product owner or PM. --> |
| Quality expert / manager | <!-- Name of quality role if applicable; else “—”. --> |
| Moderator | <!-- Review moderator: owns process, schedule, consolidation. --> |
| Author(s) | <!-- Author(s) of the review object(s); main contact for rework. --> |

### 2.2 Review objects

<!-- List the specific artefacts under review (files, modules, documents, commits). Use Abbr. as a short label for each row (used in findings and assignments). Add rows if needed. -->

| # | Review objects | Abbr. |
|---|----------------|-------|
| 1 | <!-- e.g. docs/spec/requirements.md --> | <!-- e.g. REQ --> |
| 2 | <!-- e.g. backend/…/SessionService.java --> | <!-- e.g. SES --> |
| 3 | <!-- optional third object --> | <!--  --> |

### 2.3 Reference documents

<!-- List materials reviewers need for context (requirements baseline, architecture, API spec, course brief). Use Abbr. for cross-references. -->

| # | Reference documents | Abbr. |
|---|---------------------|-------|
| 1 | <!-- e.g. docs/esbot.md --> | <!-- EB --> |
| 2 | <!-- e.g. docs/spec/requirements.md --> | <!--  --> |
| 3 | <!-- optional third reference --> | <!--  --> |

### 2.4 Checklists / scenarios

<!-- Specify which checklists, reading guides, or test scenarios reviewers should follow (course checklist, OWASP skim, API contract checks). -->

| # | Checklists / scenarios |
|---|-------------------------|
| 1 | <!-- e.g. Requirements completeness checklist (section A–D). --> |
| 2 | <!-- e.g. REST error-handling scenario list. --> |

### 2.5 Reviewer assignment

<!-- Up to 10 reviewers: assign names and which chapters, objects, or checklists each person covers. Use Abbr. for initials or short IDs. -->

| Reviewer | Names (and chapters / checklists or scenarios assigned to the review) | Abbr. |
|:--------:|---------------------------------------------------------------------------|-------|
| 1 | <!-- Assign specific reviewers to sections or checklists; include scope of review. --> | <!-- e.g. AB --> |
| 2 | <!--  --> | <!--  --> |
| 3 | <!--  --> | <!--  --> |
| 4 | <!--  --> | <!--  --> |
| 5 | <!--  --> | <!--  --> |
| 6 | <!--  --> | <!--  --> |
| 7 | <!--  --> | <!--  --> |
| 8 | <!--  --> | <!--  --> |
| 9 | <!--  --> | <!--  --> |
| 10 | <!--  --> | <!--  --> |

### 2.6 Kick-off

<!-- Optional but recommended: align on scope, Master Plan, and context before individual preparation. -->

| Date / time / location |
|------------------------|
| <!-- e.g. 2026-04-22 14:00 CET, Room X / video link --> |

### 2.7 Individual preparation

<!-- Planning figures for the preparation phase. “Optimal” rows support effort estimation (rate × time ≈ size). For documents without NLOC, substitute pages or words and state that in the Size unit cell. -->

| Individual preparation | Value | Unit |
|------------------------|-------|------|
| Submission of findings by | <!-- Enter the deadline by which each reviewer submits findings to the moderator (date/time or rule such as “72h after kick-off”). --> | — |
| Size of review objects | <!-- Enter the total Non-Comment Lines of Code (NLOC) for code; for specification-only reviews, use pages or words and note the unit here. --> | NLOC |
| Optimal inspection rate | <!-- Target or measured inspection speed (e.g. NLOC per hour per reviewer). --> | NLOC/h |
| Optimal inspection time | <!-- Planned total inspection time in hours (placeholder 0.00 until estimated or measured). --> | h |

### 2.8 Review meeting

| Date / time / location |
|------------------------|
| <!-- e.g. 2026-04-25 10:00 CET, Room Y / video link --> |

### 2.9 Additional milestones (optional)

<!-- Not in the classic Masterplan sheet; useful for course tracking (rework, closure). -->

| Milestone | Planned date / time | Actual date / time |
|-----------|---------------------|---------------------|
| End of individual preparation | <!-- same as or before “Submission of findings by” --> | <!--  --> |
| Rework deadline | <!--  --> | <!--  --> |
| Follow-up / closure | <!--  --> | <!--  --> |

---

## 3. List of findings (LoF)

Use one row per finding. Extend the table if your course requires extra columns.

Suggested values: **Type** — defect, question, suggestion; **Severity** — blocking, major, minor, editorial (define team scale); **Status** — open, accepted, rejected, deferred, fixed (update through meeting and rework).

| ID | Location (file / section / module) | Summary | Type | Severity | Status | Owner | Notes / meeting decision |
|----|-------------------------------------|---------|------|----------|--------|-------|--------------------------|
| F-001 | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> |
| F-002 | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> |

---

## 4. Data Summary (DS)

<!-- Key metrics for this review. Fill after preparation and/or after rework. -->

| Metric | Value | Notes |
|--------|-------|-------|
| Size of review object | <!-- e.g. pages, LOC, #requirements --> | <!-- --> |
| Preparation effort (hours, optional) | <!-- per role --> | <!-- --> |
| Number of findings (initial) | <!-- --> | <!-- --> |
| Number of findings after meeting | <!-- --> | <!-- --> |
| Rework effort (hours, author) | <!-- --> | <!-- --> |
| Re-inspection required? | <!-- yes / no --> | <!-- --> |

---

## 5. Review Report (RR)

### 5.1 Summary

<!-- Short executive summary: object reviewed, outcome, overall quality impression. -->

### 5.2 Review outcome

- **Review object state after review:** <!-- e.g. accepted with changes, requires re-inspection, not accepted -->
- **Major risks or themes:** <!-- bullet list -->

### 5.3 Decisions and follow-up

| Topic | Decision | Responsible | Due date |
|-------|----------|-------------|----------|
| <!-- --> | <!-- --> | <!-- --> | <!-- --> |

### 5.4 Positive observations (optional)

<!-- What was done well; good practices worth keeping. -->

### 5.5 Lessons learned (optional)

<!-- Process improvements for the next review. -->

### 5.6 Sign-off

| Role | Name | Signature / date |
|------|------|------------------|
| Moderator | <!-- --> | <!-- --> |
| Author | <!-- --> | <!-- --> |

---

<!-- End of template -->
