package archive.portmarty.connect.ui.composable.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navDeepLink
import androidx.navigation.toRoute
import archive.portmarty.connect.ui.composable.screen.cart.AVMCTCartScreen
import archive.portmarty.connect.ui.composable.screen.checkout.AVMCTCheckoutScreen
import archive.portmarty.connect.ui.composable.screen.home.AVMCTHomeScreen
import archive.portmarty.connect.ui.composable.screen.onboarding.AVMCTOnboardingScreen
import archive.portmarty.connect.ui.composable.screen.order.AVMCTOrdersScreen
import archive.portmarty.connect.ui.composable.screen.productdetails.AVMCTProductDetailsScreen
import archive.portmarty.connect.ui.composable.screen.settings.AVMCTSettingsScreen
import archive.portmarty.connect.ui.composable.screen.splash.AVMCTSplashScreen

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = NavRoute.Splash,
        modifier = modifier,
    ) {
        composable<NavRoute.Splash> {
            AVMCTSplashScreen(
                onNavigateToHomeScreen = {
                    navController.navigate(route = NavRoute.Home) {
                        popUpTo(navController.graph.startDestinationId) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                },
                onNavigateToOnboarding = {
                    navController.navigate(route = NavRoute.Onboarding) {
                        popUpTo(navController.graph.startDestinationId) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                }
            )
        }

        composable<NavRoute.Onboarding> {
            AVMCTOnboardingScreen(
                onNavigateToHomeScreen = {
                    navController.navigate(NavRoute.Home) {
                        popUpTo(NavRoute.Onboarding) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                }
            )
        }

        composable<NavRoute.Home>(
            deepLinks = listOf(navDeepLink { uriPattern = "portmarty://app/home" })
        ) {
            AVMCTHomeScreen(
                onNavigateToProductDetails = { id: Int ->
                    navController.navigate(
                        route = NavRoute.ProductDetails(id = id)
                    )
                }
            )
        }

        composable<NavRoute.ProductDetails>(
            deepLinks = listOf(navDeepLink { uriPattern = "portmarty://app/product/{id}" })
        ) { backStackEntry ->
            val productDetails: NavRoute.ProductDetails = backStackEntry.toRoute()
            AVMCTProductDetailsScreen(
                productId = productDetails.id,
            )
        }

        composable<NavRoute.Cart>(
            deepLinks = listOf(navDeepLink { uriPattern = "portmarty://app/cart" })
        ) {
            AVMCTCartScreen(
                onNavigateToCheckoutScreen = {
                    navController.navigate(NavRoute.Checkout)
                }
            )
        }

        composable<NavRoute.Checkout>(
            deepLinks = listOf(navDeepLink { uriPattern = "portmarty://app/checkout" })
        ) {
            AVMCTCheckoutScreen(
                onNavigateToOrdersScreen = {
                    navController.navigate(NavRoute.Orders) {
                        popUpTo(NavRoute.Home) { inclusive = false }
                    }
                }
            )
        }

        composable<NavRoute.Orders>(
            deepLinks = listOf(navDeepLink { uriPattern = "portmarty://app/orders" })
        ) {
            AVMCTOrdersScreen()
        }

        composable<NavRoute.Settings>(
            deepLinks = listOf(navDeepLink { uriPattern = "portmarty://app/settings" })
        ) {
            AVMCTSettingsScreen()
        }
    }
}