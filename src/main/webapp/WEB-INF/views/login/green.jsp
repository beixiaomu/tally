<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<title>Lowin</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/login/auth.css">
</head>

<body>
	<div class="lowin lowin-green">
		<div class="lowin-brand">
			<img src="${pageContext.request.contextPath}/static/img/login/kodinger.jpg" alt="logo">
		</div>
		<div class="lowin-wrapper">
			<div class="lowin-box lowin-login">
				<div class="lowin-box-inner">
					<form>
						<p>Sign in to continue</p>
						<div class="lowin-group">
							<label>Email <a href="#" class="login-back-link">Sign in?</a></label>
							<input type="email" autocomplete="email" name="email" class="lowin-input">
						</div>
						<div class="lowin-group password-group">
							<label>Password <a href="#" class="forgot-link">Forgot Password?</a></label>
							<input type="password" name="password" autocomplete="current-password" class="lowin-input">
						</div>
						<button class="lowin-btn login-btn">
							Sign In
						</button>

						<div class="text-foot">
							Don't have an account? <a href="" class="register-link">Register</a>
						</div>
					</form>
				</div>
			</div>

			<div class="lowin-box lowin-register">
				<div class="lowin-box-inner">
					<form>
						<p>Let's create your account</p>
						<div class="lowin-group">
							<label>Name</label>
							<input type="text" name="name" autocomplete="name" class="lowin-input">
						</div>
						<div class="lowin-group">
							<label>Email</label>
							<input type="email" autocomplete="email" name="email" class="lowin-input">
						</div>
						<div class="lowin-group">
							<label>Password</label>
							<input type="password" name="password" autocomplete="current-password" class="lowin-input">
						</div>
						<button class="lowin-btn">
							Sign Up
						</button>

						<div class="text-foot">
							Already have an account? <a href="" class="login-link">Login</a>
						</div>
					</form>
				</div>
			</div>
		</div>
	
		<footer class="lowin-footer">
			Design By <a href="http://fb.me/itskodinger">@itskodinger</a>
		</footer>
	</div>

	<script src="${pageContext.request.contextPath}/static/js/login/auth.js"></script>
	<script>
		Auth.init({
			login_url: '#login',
			forgot_url: '#forgot'
		});
	</script>
</body>
</html>