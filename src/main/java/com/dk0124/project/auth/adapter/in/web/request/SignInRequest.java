package com.dk0124.project.auth.adapter.in.web.request;

import jakarta.validation.constraints.NotNull;

public record SignInRequest(@NotNull String userName, @NotNull String password) {
}
