package org.sdaee24;

import java.time.LocalDateTime;
import java.util.UUID;

public class WashResponse {
    private UUID uniqueWashId;
    private LocalDateTime washingDateTime;

    public WashResponse() {
    }

    public UUID getUniqueWashId() {
        return this.uniqueWashId;
    }

    public LocalDateTime getWashingDateTime() {
        return this.washingDateTime;
    }

    public void setUniqueWashId(UUID uniqueWashId) {
        this.uniqueWashId = uniqueWashId;
    }

    public void setWashingDateTime(LocalDateTime washingDateTime) {
        this.washingDateTime = washingDateTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WashResponse)) return false;
        final WashResponse other = (WashResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$uniqueWashId = this.getUniqueWashId();
        final Object other$uniqueWashId = other.getUniqueWashId();
        if (this$uniqueWashId == null ? other$uniqueWashId != null : !this$uniqueWashId.equals(other$uniqueWashId))
            return false;
        final Object this$washingDateTime = this.getWashingDateTime();
        final Object other$washingDateTime = other.getWashingDateTime();
        if (this$washingDateTime == null ? other$washingDateTime != null : !this$washingDateTime.equals(other$washingDateTime))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof WashResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $uniqueWashId = this.getUniqueWashId();
        result = result * PRIME + ($uniqueWashId == null ? 43 : $uniqueWashId.hashCode());
        final Object $washingDateTime = this.getWashingDateTime();
        result = result * PRIME + ($washingDateTime == null ? 43 : $washingDateTime.hashCode());
        return result;
    }

    public String toString() {
        return "WashResponse(uniqueWashId=" + this.getUniqueWashId() + ", washingDateTime=" + this.getWashingDateTime() + ")";
    }
}
