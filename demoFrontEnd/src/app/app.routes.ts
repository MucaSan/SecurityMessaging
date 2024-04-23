import { Routes } from '@angular/router';
import { LoginModule } from './login/login.module';
import { LoginComponent } from './login/login.component';
import { SigninComponent } from './signin/signin.component';
import { CryptoAppComponent } from './crypto-app/crypto-app.component';

// export const routes: Routes =[
//     {path: 'login', 
//      component: LoginComponent,
//     },
//     {
//         path: 'signin',
//         component: SigninComponent,
//     },
//     {
//         path: 'crypto-app',
//         component: CryptoAppComponent,
//     },
// ];

export const routes: Routes = [
    {
        path: '', 
        loadChildren: ()=> 
            import('./login/login.module').then((m)=> m.LoginModule),
    },
];
