package pl.gregorymartin.as6.service;


import org.springframework.lang.NonNull;

class Feedback {
    private String name;
    @NonNull
    private String email;
    @NonNull
    private String feedback;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @NonNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NonNull final String email) {
        this.email = email;
    }

    @NonNull
    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(@NonNull final String feedback) {
        this.feedback = feedback;
    }
}
