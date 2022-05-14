function [t, x] = RK4(h, t_max)
    x = [-0.4, 0.5];    % given initial x values stored in 1st row
    t = 0:h:t_max;         % t axis with interval [0, t_max] and step of size h

    for n = 1:(length(t) - 1)   % - 1 because we already know the value at 0
        % each k_i ( i = 1,2,3,4) contains two results, k_i(1) for x(1) and k_i(2) for x(2)
        % t doesn't matter and is written here only for the clarity sake
        k1(1, :) = func(t(n), x(n, :));
        k2(1, :) = func(t + h/2, x(n, :) + h*k1/2);
        k3(1, :) = func(t + h/2, x(n, :) + h*k2/2);
        k4(1, :) = func(t + h, x(n, :) + h*k3);
        % in the next row store new x values
        x(n+1, :) = x(n, :) + h/6 * (k1 + 2*k2 + 2*k3 + k4);
    end
end