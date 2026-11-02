package archive.portmarty.connect.di

import archive.portmarty.connect.ui.viewmodel.AppViewModel
import archive.portmarty.connect.ui.viewmodel.CartViewModel
import archive.portmarty.connect.ui.viewmodel.CheckoutViewModel
import archive.portmarty.connect.ui.viewmodel.OnboardingViewModel
import archive.portmarty.connect.ui.viewmodel.OrderViewModel
import archive.portmarty.connect.ui.viewmodel.ProductDetailsViewModel
import archive.portmarty.connect.ui.viewmodel.ProductViewModel
import archive.portmarty.connect.ui.viewmodel.SplashViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModule = module {
    viewModel {
        AppViewModel(
            cartRepository = get()
        )
    }

    viewModel {
        SplashViewModel(
            onboardingRepository = get()
        )
    }

    viewModel {
        OnboardingViewModel(
            onboardingRepository = get()
        )
    }

    viewModel {
        ProductViewModel(
            productRepository = get(),
            cartRepository = get(),
        )
    }

    viewModel {
        ProductDetailsViewModel(
            productRepository = get(),
            cartRepository = get(),
        )
    }

    viewModel {
        CheckoutViewModel(
            cartRepository = get(),
            productRepository = get(),
            orderRepository = get(),
        )
    }

    viewModel {
        CartViewModel(
            cartRepository = get(),
            productRepository = get(),
        )
    }

    viewModel {
        OrderViewModel(
            orderRepository = get(),
        )
    }
}